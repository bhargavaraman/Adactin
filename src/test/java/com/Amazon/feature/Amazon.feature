Feature: HardDisk Search in Amazon Website

Scenario: User searches for a hard disk on Amazon
 Given the user is on the Amazon homepage
 When the user enters HardDisk into the search bar
 And the user clicks on the search button
 Then the search results page should be displayed
