# Team Convention กลุ่มที่ : 5
- ใช้ภาษา Java
- Program ที่ใช้ในการพัฒนา Netbeans
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
- ชื่อ class ชื่อ แพคเกต ขึ้นต้นตัวใหญ่
```
package Week1;

public class Count_vowel {
}
```
- ในการตั้งชื่อทุกอย่างในโปรเจดจะใช้อันเดอร์สกอร์และหลังอันเดอร์สกอร์จะเป็นตัวเล็ก เช่น variable_example
- ตัวแปรทั้งหมดจะต้องสื่อความหมาย
### อื่นๆ
- จำกัดตัวอักษร 100 ตัวอักษรต่อ 1 บรรทัด
- ถ้าจะมีคอมเม้นของ method จะคอมเม้นข้างใต้ชื่อ method เพื่อบอกว่า method นั้นทำงานอย่างไร
```
public int one() {
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