<p align="center">
  <a href="https://spring.io/" target="blank"><img src="https://www.pngfind.com/pngs/m/53-535670_spring-framework-logo-spring-boot-hd-png-download.png" width="320" alt="Nest Logo" /></a>
</p>

Requests:

# POST [Create Account]

http://localhost:8081/api/auth/signup
{
    "username":"mohamed",
    "email":"mohamed.derbali@esprit.tn",
    "password":"12345678",
    "role":[
        "mod","user"
    ]
}
# POST [Login]

http://localhost:8081/api/auth/signin
{
        "username":"mohamed",
        "password":"12345678"
}

# GET [User From Token]
http://localhost:8081/api/user/profile
