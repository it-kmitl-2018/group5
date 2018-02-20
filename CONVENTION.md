# Team Convention กลุ่มที่ : 5
- ใช้ภาษา Java
- โปรแกรมที่ใช้ในการพัฒนา IntelliJ IDEA

<p align="center">
    <img alt="Java banner" title="Java banner" src="https://4a7efb2d53317100f611-1d7064c4f7b6de25658a4199efb34975.ssl.cf1.rackcdn.com/patch-or-perish-java-ftc-tells-oracle-showcase_image-1-p-2014.jpg" width="400">
</p>

### การเว้นบรรทัด
- 1 white space ก่อนปีกกาเปิด
```
public void method1() {} 
if (a + b = c) {}
```
- เว้นบรรทัด 1 บรรทัดระหว่างmethod เพื่อแยกให้เป็นสัดส่วน
```
public void method1() {
    }

public void method2() {
    }
```
- ในการตั้งเงื่อนไขเราจะเว้น white space แบบนี้
```
if (ch == 'a' || ch == 'e' || ch == 'i'
    || ch == 'o' || ch == 'u') {
```
### การตั้งชื่อ
- ชื่อ class ชื่อ แพคเกต ขึ้นต้นตัวใหญ่ เป็นแบบ Upper-Camel Case
```
package Week1;

public class CountVowel {
}
```
- ในการตั้งชื่อตัวแปรในโปรเจดจะใช้ Camel Case ex. > countNumber
- ตัวแปรทั้งหมดจะต้องสื่อความหมาย
### อื่นๆ
- จำกัดตัวอักษร 100 ตัวอักษรต่อ 1 บรรทัด
- ถ้าจะมีคอมเม้นของ method ที่ยากๆ จะคอมเม้นข้างใต้ชื่อ method เพื่อบอกว่า method นั้นทำงานอย่างไร
```
public int zero() {
    //This method is return 0
    return 0;
}
```
- ถ้าต้องมีการ import จะเอาส่วนของ import ไว้ใต้ package
```
package test.test.test;

import java.util.*;
```
- เว้นวรรค 1 ครั้งระหว่าง condition และใน 1 บรรทัดจะมีไม่เกิน 3 condition ถ้าเกินก็เว้นบรรทัดลงไป
```
if (ch == 'a' || ch == 'e' || ch == 'i'
    || ch == 'o' || ch == 'u') {
```
### Commit Message
- ขึ้นต้นด้วยตัวใหญ่
- ไม่ลงท้ายด้วย "." 
- แต่ละ commit ต้องสื่อความหมายว่าได้เพิ่ม เปลี่ยนแปลง หรือแก้ไขอะไรไปบ้าง

### Pull request
- ขึ้นต้นด้วยตัวใหญ่
- ไม่ลงท้ายด้วย "." 
- แต่ละ pull request ต้องสื่อความหมาย