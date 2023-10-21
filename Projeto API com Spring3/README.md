# bootcamp-java-trabalhos
Repositorio para colocar os desafios do programa de bootcamp em java da dio.

## Diagrama de Classes

  ```mermaid
  classDiagram
  class User {
    - name: String
    - account: Account
    - icons: Icons
    - Photos[] photos
    - downBar: DownBar
  }

  class Account {
    - profilePhoto: ProfilePhotos
    - Username: String
    - accountFollowers: Number
    - accountFollowing: Number
    - bio: String
  }

  class ProfilePhotos{
    - photo : String
    - description : String
  }

  class Icons {
    - icon1: String
    - icon2: String
  }

  class Photos {
    - photo : String
    - description : String
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
  Account "1" *-- "1" ProfilePhotos

  ```
