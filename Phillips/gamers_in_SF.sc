object gamers_in_SF {
  //"How many gamers are in the San Francisco Bay Area? Describe each step in your thought process."
  /*
  First, I will start with the general population of the Bay Area, which I will estimate as 7 million people.
  Since most gamers are male, I will subtract the 50% of the population which are female. (Assuming that the population is about 50% male and 50% female.
  Next, I will make the assumption that most gamers are between the ages of 15-45.
  Assuming that the population is evenly distributed across all ages, and furthermore, that 100 is the oldest age (which is not true, but will make this estimation much easier),
  that gives: 45-15=30 which is the percentage of males in the age range 15-45.
  Finally, I will make the assumption that about 70% of the males within this age range are gamers.
  */
  
  //Putting this all together gives:
  
  //The general population of the Bay Area
  val SFpop = 7000000                             //> SFpop  : Int = 7000000
  //Percentage of males
  val malepercent = .5                            //> malepercent  : Double = 0.5
  
  //Percentage of males between the age of 15-45
  val agepercent = .3                             //> agepercent  : Double = 0.3
  //Percentage of males within the age range that are gamers
  val gamerpercent = .7                           //> gamerpercent  : Double = 0.7
  //Gamers in Bay Area
  val SFgamers = SFpop * malepercent * agepercent * gamerpercent
                                                  //> SFgamers  : Double = 735000.0
  // In conclusion, I estimate that there are 735,000 gamers in the San Francisco Bay Area.
}