'use strict'

angular.module('app.controllers', [])

.controller('RandomQuoteCtrl', function($scope, QuoteService) {
	QuoteService.random()
		.$promise.then(function(quote) {
			$scope.quote = quote;
		});
})
.controller('AuthorCtrl', function($scope,$stateParams, QuoteService){
	console.log($stateParams.authorName);
	QuoteService.author({name:$stateParams.authorName})
	    .$promise.then(function(author){
	    	 console.log(author.name);
	    	 $scope.author=author;
	    	});
})
.controller('SaveQuoteCtrl', function($scope, $state, QuoteService) {
    
    $scope.saveQuote = function() {
        QuoteService.save(
            $scope.quote,
            function(response) {
                $state.go("quote", {});
            },
            function(err) {
                console.log(err);
            }
        );
    };
});