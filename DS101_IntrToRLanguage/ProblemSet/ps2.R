install.packages("tidyverse")
library(tidyverse)

# problem 1(a)
range_len <- function(vec) {
  
  range(vec)[2] - range(vec)[1]
}

# problem 2(a): https://chat.openai.com/share/ee0b2d28-ffac-4c79-8b4d-d2be22983a94

# problem 2
compute_gdp_col <- function(df) {
  
  df %>% mutate(gdp = gdpPercap * pop)
}

# problem 3(a)
cont_gdp <- function(df) {
  
  ContGDPdf <- df %>% mutate(gdp = gdpPercap * pop) %>% 
    group_by(continent, year) %>% summarise(contgdp = sum(gdp)) %>% arrange(continent, year)
}

# problem 3(b): https://chat.openai.com/share/037b2996-7f45-420b-abf7-630e44af7c12

# problem 4: https://chat.openai.com/share/4c74b680-ccd0-47b8-b231-3c8e47a7fe50

# problem 5
median_gdppc_range <- function(df){
  
  dfRange <- df %>% group_by(country) %>% summarise(gdpPercapRange = range_len(gdpPercap))
  rangeMedian <- median(dfRange$gdpPercapRange)
  countryAns <- dfRange %>% mutate(RangeDiff = abs(gdpPercapRange - rangeMedian)) %>% 
    filter(RangeDiff == min(RangeDiff))
  
  closestCountry <- countryAns$country[1]
}
