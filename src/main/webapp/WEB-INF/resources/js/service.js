(function (angular) {
    angular.module('restAPI')
        .service('companyService', ['$http', function ($http) {
            var urlBase = 'http://localhost:8080/rest/companies/';

            this.getAllCompanies = function () {
                return $http.get(urlBase);
            };
            
            this.addCompany = function () {
                
            }
        }]);
})(window.angular);