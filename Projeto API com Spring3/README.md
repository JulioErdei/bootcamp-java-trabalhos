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
    - photo1: String
    - photo2: String
    - photo3: String
    - photo4: String
    - photo5: String
    - photo6: String
    - photo7: String
    - photo8: String
    - photo9: String
    - photo10: String
    - photo11: String
    - photo12: String
  }

  class DownBar {
    - home: String
    - search: String
    - reels: String
    - shop: String
    - profile: String
  }

  User --> Account
  User --> Icons
  User --> Photos
  User --> DownBar

  ```
