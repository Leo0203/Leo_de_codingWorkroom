problem 2 

range_len(c(-2, 1, 5))
***********************************************
range(c(-2, 1, 5))[2] - range(c(-2, 1, 5))[1]
***********************************************
c(-2, 5)[2] - c(-2, 5)[1]
***********************************************
5 - (-2)
***********************************************
7
***********************************************




problem 3(b)
cont_gdp(gapminder)
***********************************************

ContGDPdf <- gapminder %>% mutate(gdp = gdpPercap * pop) %>% 
    group_by(continent, year) %>% summarise(contgdp = sum(gdp)) %>% arrange(continent, year)
***********************************************

ContGDPdf <- data.frame(country = c("Afghanistan", ...), continent = c("Africa", ...), year = c(1952, ...), pop = c(8425333, ...), gdppercap = c(779.4453, ...), gdp = c(6567086330, 7585448670, ...)) %>% 
    group_by(continent, year) %>% summarise(contgdp = sum(gdp)) %>% arrange(continent, year)
***********************************************

ContGDPdf <- data.frame(country = c("Afghanistan", ...), continent = c("Africa", ...), year = c(1952, ...), pop = c(8425333, ...), gdppercap = c(779.4453, ...), gdp = c(6567086330, 7585448670, ...), contgdp = c(sum(22725632678, 14899557133, ...), sum(1.056763e+11, 7.719575e+09, ...),  ...))  %>% arrange(continent, year)
***********************************************

ContGDPdf <- data.frame(continent = c("Africa", ...), year = c(1952, ...) , contgdp = c(3.115993e+11, 3.826778e+11, ...))
***********************************************


problem 4

g <- data.frame(country = c("Canada", "USA", "Canada", "USA"), year = c(2000, 2000, 1990,1990), lifeExp = c(75, 74, 78, 75)) %>% 
        summarize(latestLifeExp = first_elem(lifeExp),
                  earliestLifeExp = last_elem(lifeExp),
                  earliestYear = min(year),
                  latestYear = max(year)) %>% 
        mutate(avgLEinc = (latestLifeExp-earliestLifeExp)/(latestYear-earliestYear))
***********************************************

g <- data.frame(country = c("Canada", "USA", "Canada", "USA"), year = c(2000, 2000, 1990,1990), lifeExp = c(78, 75, 75, 74), latestLifeExp = c(78, 75), earliestlifeExp = c(75, 74), earliestYear = 1990, latestYear = 2000) %>% 
        mutate(avgLEinc = (latestLifeExp-earliestLifeExp)/(latestYear-earliestYear))
***********************************************

g <- data.frame(latestLifeExp = c(78, 75), earliestlifeExp = c(75, 74), earliestYear = 1990, latestYear = 2000, avgLEinc = c((78-75)/(2000-1990), (75-74)/(2000-1990)))
***********************************************

g <- data.frame(latestLifeExp = c(78, 75), earliestlifeExp = c(75, 74), earliestYear = 1990, latestYear = 2000, avgLEinc = c(0.3, 0.1))
***********************************************



