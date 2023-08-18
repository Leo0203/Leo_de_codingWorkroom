# Data Visulization
## What is
1. Graphically summarizing the data in the best method
    - the best method would make the data memorable, not misleading, and comprehensible
    - title: y axis vs. xaxis

2. Preattentive Search
    - color pops out more compare to shapes
    - more data make things more difficult to locate
    - Humans readily preceive patterns (real or not: like faces) based on proximity, similarity, connection, continuity, closre, belonging to background, common movement

3. A book to recommend: vissoc.co (data visulization: a practical introduction by kieran healy)

## Practical Visulization
1. ggplot is the function used in R to create graph
```R

ggplot(data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + geom_point()
ggplot(data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + geom_smooth(method = "loess", se = F)
ggplot(data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + geom_point() + geom_smooth(method = "loess", se = F)

```
    - geom_point means point plot
    - geom_smooth means the points are to be connected with a smooth line
        - loess is a plotting method that create a line that fit the points the most, se = F means the ribbon is not displayed. The ribbon displays the uncertainty that the plot has
    - the third line would plot the smooth line over the point plot, i.e two layers
2. changing the magnitude of the axis
```R

ggplot(data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + geom_smooth(method = "lm", se = F)
ggplot(data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + geom_smooth(method = "lm", se = F) + scale_x_log10()
ggplot(data = gapminder, mapping = aes(x = log10(gdpPercap), y = lifeExp)) + geom_smooth(method = "lm", se = F)
ggplot(data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + geom_smooth(method = "lm", color = "black", se = F) + scale_x_log10(labels = scales::dollar)
```
    - lm means creating a streight line 
    - scale x log10 means the x axis is compressed with the same gapminder data displayed. Each increment is now a power of the ten. The same thing can be achieved by manipulation in the definition of axis. However, this will also change the name of the axis which influence the readability of the graph
    - the labels of an axis can also be specified and the number will be displayed in the indicated units

3. a fancier improvement
```R

ggplot (data = gapminder, mapping = aes(x = gdpPercap, y = lifeExp)) + 
        geom_point(alpha = 0.3) + 
        geom_smooth(method = "lm") + 
        scale_x_log10(labels = scales::dollar) + 
        labs(x = "gdp per capita" , y = "life expectancy in years", 
        title = "economic growth and life expectancy", subtitle = "ddata points are country-years", 
        caption = "source: gapminder")
```
    - alpha means transparency measure

4. displaying using color 
```R

gap.1982 <- gapminder %>% filter(year = 1982)
ggplot(data = gap.1982, mapping = aes(x = gdpPercap, y = lifeExp, color = continent)) + geom_point() + 
        scale_x_log10(labels = scales::dollar)
```
    - the real meaning of "mapping" becomes more prominent here: to use a specific method to represent the data. e.g: use an aixs to represent, use color to represent