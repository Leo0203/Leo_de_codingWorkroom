# Introduction to Predictive Modeling 

## Training Set
1. notations:
    - m = number of trainging examples
    - x’s = “input” variable / features
    - y’s = “output” variable / “target” variable

2. Errors
    - Errors are not avoidable when approximate datas and predict furture trend
    - If the correct price is 𝑦(𝑖) and we predicted 𝑎0 + 𝑎1𝑥 𝑖 , we are off by |𝑦𝑖 − 𝑎𝑜+𝑎1𝑥𝑖 | (“error”)
    - If we square this quantity, we still have a measure of how far off we are (𝑦 𝑖 − 𝑎𝑜 + 𝑎1𝑥 𝑖)2 (“squared error”)
    - Overall, we will be off (in terms of squared errors) by 

## Simple Linear Regression
1. find the coefficient of a0 + a1x so that the sum of squared error is minimized
2.Graphically, roughly corresponds to “draw the best line through the scatterplot”

3. Multiple Linear Regression
    - n quantities per case
    - Find 𝑎0,𝑎1,...,𝑎𝑛 such that the sum of squared error is the smallest

4. Transforming Input
    - some times an input is not trended as a polynomial function. One can take the log of one of the variables or manipulate the veriables to fit a linear/polynomial trend
5. In Code
```R

library(gapmindder)
lm(lifeExp ~ gdpPercap, data = gapminder)
# coefficient:
#   (intercept) gdpPercap
#   5.396e+01   7.649e-04
#lifeExp is approx 5.36e+01 + 7.649e-04*gdpPercap

model1 <- lm(lifeExp ~ gdpPercap, data = gapminder)
preds1 <- perdict(model1, newdata = gapminder)

plot(gapminder&lifeExp, preds1)
sum((gapminder$lifeExp - preds1)**2)

model2 <- lm(lifeExp ~ log(gdpPercap), data = gapminder)
preds2 <- perdict(model2,newdata = gapminder)

plot(gapminder$lifeExp, preds2) # this is a better prediction than preds1
sum((gapminder$lifeExp - preds2)**2)

```

6. Catagorical Variables
    - quantitive variables are numbers
        - number, size, weight
        - discrete variabels are still treated as quantitive
    - categorical variables indicate categories
        - country, continent
        - cannot put continents on a single scale
    - vavriables thats neither continuous or discrete: color, scale response

    - in code
```R

model3 <- lm(lifeExp ~ log(gdpPercap) + continent, data = gapminder)
preds3 <- perdict(model3,newdata = gapminder)
sum((gapminder$lifeExp - preds3)**2)
```

7. Practice: use the titanic package to predict
```R

install.packages("titianic")
model1 <- glm(Survived ~ Sex + Age + Pclass, family = "binomial", data = titianic_train)

# Prob(Survived = 1) = sigma(5.05 - 2.5*Ismale - 0.037*Age - 1.28*Pclass)
# sigma(z) = 1/(1+exp(-z))

# glm means logistic prediction, it is used here because logistic returns a number bw 0 to 1

plogis(predict(model1, newdata = titianic_treain))  # this gives the prob for each one to survive

# plogis(z) = 1/(1+exp(-z))

mean(((plogis(predict(model1, newdata = titianic_treain))) > 0.5) == titanic_train$Survivied, na.rm = TRUE)
# true means the prediction == actual situation
# 0.79 meaning 79% of the prediction is correct 

# na.rm = TRUE will eliminate the NA section in the dataset so that mean can be calculated
```
