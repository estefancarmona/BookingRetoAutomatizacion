#Author: yeanrodr@bancolombia.com.cos
@check_hotels
Feature: Check popular hotels
As a user, I want to go to booking.com 
I want to search for a city 
To verify that the list of the most popular hotels is displayed.

@search_hotels_popular
Scenario Outline: Search destination city 
Given the actor enters the page and search for name city
When  the actor performs the search
And   and select a pupil filter
Then  validate the text of the first result 
  | <nameResult> |
 Examples:
    | nameCity              | nameResult                        | 
    | 'Cartagena de Indias' | 'Hampton by Hilton Cartagena'     |
    | 'Medellín'            | 'Café Hotel By Lars'              |

