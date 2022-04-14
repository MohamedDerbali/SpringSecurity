<p align="center">
  <a href="https://spring.io/" target="blank"><img src="https://scontent.ftun10-1.fna.fbcdn.net/v/t1.6435-9/178096916_1556091027926875_2192119551196179678_n.png?_nc_cat=106&ccb=1-5&_nc_sid=e3f864&_nc_ohc=2zw_Nw5BDdUAX8EVPRQ&_nc_ht=scontent.ftun10-1.fna&oh=00_AT_yrzvhuXOwnzzYOJpeknBZmlhS-YZ3LbUjQ9h6nspPFg&oe=627D59AA" width="320" alt="Nest Logo" /></a>
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
