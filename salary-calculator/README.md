# <h1 style="background: linear-gradient(to right, rgb(182, 244, 146), rgb(51, 139, 147));; color:black">Salary Calculator</h1>

 [Document](https://academy.patika.dev/courses/java101/odev-mukemmel-sayi)

# <h5 style="background: linear-gradient(87.4deg, rgb(255, 241, 165) 1.9%, rgb(200, 125, 76) 49.7%, rgb(83, 54, 54) 100.5%); color:black">(Employee Class) Fabrika çalışanlarını temsil eden ve metotları ile çalışanların maaşlarını hesaplayan uygulama.</h5>

### <h5 style="background: linear-gradient(87.4deg, rgb(255, 241, 165) 1.9%, rgb(200, 125, 76) 49.7%, rgb(83, 54, 54) 100.5%); color:black">Sınıfın Özellikleri</h6>

 * name
 * salary
 * workHours
 * hireYear

<h5 style="background: linear-gradient(87.4deg, rgb(255, 241, 165) 1.9%, rgb(200, 125, 76) 49.7%, rgb(83, 54, 54) 100.5%); color:black">Sınıfın Metotları</h6>

 - Employee(name,salary,workHours,hireYear)
 - tax()
 - Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
 - Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
 - bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
 - raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
 - Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
 - Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
 - Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
 - toString().



## Example

    ```java
    Name :Kemal
    Salary: 2000.0
    Work Hours: 45
    Hire Year: 1985
    Tax: 60.0
    Bonus: 150.0
    Raise : 300.0
    Salary with tax and bonus: 2090.0
    Salary with raise: 2300.0
    ```