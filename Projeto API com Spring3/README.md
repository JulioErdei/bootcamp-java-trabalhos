# bootcamp-java-trabalhos
Repositorio para colocar os desafios do programa de bootcamp em java da dio.

## Diagrama de Classes

  ```mermaid
  classDiagram
  class User {
    - name: String
    - account: Account
    - icons: Icons
    - photos: Photos
    - downBar: DownBar
    
    + getUserInfo(): String
  }

  class Account {
    - profilePhoto: String
    - accountUsername: String
    - accountFollowers: Number
    - accountFollowing: Number
    - bio: String
  }

  class Icons {
    - icon1: String
    - icon2: String
  }

  class Photos {
    - photoN: String
  }

  class DownBar {
    - home: String
    - search: String
    - reels: String
    - shop: String
    - profile: String
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Icons
  User "1" *-- "N" Photos
  User "1" *-- "1" DownBar

  ```
