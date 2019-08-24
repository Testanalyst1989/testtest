Feature: Access multiple browsers in chromer browser


      @smoke
      Scenario: Access to facebook.com
        Given Go to GOOGLE browser
        When Enter the Url http:www.facebook.com
        Then it showing the facebook homepage

        @sanity
        Scenario: Access to rightmove.com
          Given Go to Google browser
          When Enter the url http:www.rightmove.com
          Then it showing the rightmove homepage

          @sanity
          Scenario: Access to zoopla.com

            Given Go to google browser
            When Enter the url http:www.zoopla.com
            Then it showing the zoopla homepage

            @sanity @smoke
            Scenario: Access to gumtree.com

              Given Go to google browser
              When Enter the url http:www.gumtree.com
              Then  it showing the gumtree homepage


              Scenario: Access to HSBC.COM

                Given Go to google browser
                When Enter the url http:www.HSBC.COM
                Then it showing the hsbc bank homepage