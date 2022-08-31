# petClinic-SpringBoot-Thymeleaf
Pet Clinic veteriner uygulaması hayvan sahiplerinin ve hayvan sahiplerinin hayvaların kayıt altına alınması sağlamak için geliştirilmiştir. Uygulama içerisinde önce hayvan sahinin kaydı ve bu hayvan sahinin sahip olduğu hayvanların kaydı gerçekleştirilebilmektedir. Sistem üserinden ilgili hayvan ya da hayvan sahibi bilgileri güncellenebilmekte veya silinebilmektedir.

## Projede Kullanılan Teknolojiler

- Java Spring Boot
- Thymeleaf
- Maven
- Lombok
- Junits(İlk test denememdi fail oldu. Test classını yorum satırına aldım. Çözünce commitleyeceğim.)
- Bootstrap
- MySql

## Pet Clinic Sistemindeki Modeller
- Owner
- Pet

Owner ve Pet olmak üzere 2 modelimiz bulunmaktadır. Sistemde ManyToOne ilişki bulunmaktadır. Böylelikle bir hayvan sahine birden fazla hayvan kaydı yapılabilir.Ancak bir hayvan yalnızca bir sahibi olabilir.
## Pet Clinic Sistemindeki Modeller Arasındaki İlişki
![Modeller Arası İlişki tablosu](https://i.hizliresim.com/ptscsw0.png)

## Pet Clinic Sisteminini Nasıl Kullanabilirsiniz.
Docker bilgisayarınızda kurulduktan sonra docker ı çalıştırmalısınız.

+ Daha sonra "**docker pull adnanyagmur/petclinic:latest**" omutunu yazarak images kendi localinize çekebilirisiniz. 
+ "**docker images**" komutunu çalıştırarak var olan images ler arasından petclinic image i pull edilmiş mi görebilirsiniz.
![ilk 3 komut](https://i.hizliresim.com/63naq46.png)
+ "**docker container run -p 8080:8080 adnanyagmur/petclinic**" comutunu çalıştırarak container ınızı oluşturabilrisiniz ve kullandığınız internet tarayıcısından "**localhost:8080**" yazarak sisteme ulaşabilirsiniz. 
![son komut](https://i.hizliresim.com/s6tnnst.png)

## Petclinic Sistemine Ait Görseller

### New Owner
![newOwner](https://i.hizliresim.com/4yk983a.png)

### Owner List
![ownerList](https://i.hizliresim.com/45acy5q.png)

### Owner Detail Page
![ownerDetailPage](https://i.hizliresim.com/mxk90rv.png)

### Owner Detail Page -> Add Pet
![addPet](https://i.hizliresim.com/si39pgz.png)

### Home Page (Pet List)
![homePage](https://i.hizliresim.com/cofpho3.png)

### Pet Detail Page
![petDetailPage](https://i.hizliresim.com/qorpegx.png)


