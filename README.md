# Simple spring boot scheduler
A simple spring boot scheduler

## Cron expressions
The cron scheduler expressions are generated from https://www.freeformatter.com/cron-expression-generator-quartz.html

## Common Expressions
  
````
  * * * ? * *	Every second
  0 * * ? * *	Every minute
  0 15,30,45 * ? * *	Every hour at minutes 15, 30 and 45
  0 0 * ? * *	Every hour
  0 0 0/2 ? * *	Every even hour
  0 0 */8 ? * *	Every eight hours
  0 0 6 * * ?	Every day at 6am
````
