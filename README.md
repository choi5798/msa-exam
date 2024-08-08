## MSA-Exam

Spring Cloud를 이용한 MSA 기반 프로젝트 실습

## API 명세서

![](https://img.shields.io/static/v1?label=&message=GET&color=blue)
![](https://img.shields.io/static/v1?label=&message=POST&color=brightgreen)
![](https://img.shields.io/static/v1?label=&message=PUT&color=orange)
![](https://img.shields.io/static/v1?label=&message=DELETE&color=red)

### products

---

### 상품 추가

> ![](https://img.shields.io/static/v1?label=&message=POST&color=brightgreen) <br>
> localhost:19091/**products**

<details markdown="1">
<summary>detail</summary>

#### Parameters

##### Body

|     name     |  type   | description |
|:------------:|:-------:|:-----------:|
|  product_id  |  Long   |    상품 ID    | 
|     name     | String  |    상품 이름    |
| supply_price | Integer |    상품 가격    |

#### Response

  <summary>200 Ok : 상품 추가 성공</summary>

</details>

### 상품 목록 조회

> ![](https://img.shields.io/static/v1?label=&message=GET&color=blue) <br>
> localhost:19091/**products**

<details markdown="1">
<summary>detail</summary>

#### Response

  <details markdown="1">
  <summary>200 Ok : 상품 목록 조회 성공</summary>

```json
[
  {
    "product_id": 1,
    "name": "상품 1",
    "supply_price": 1000
  },
  ...
]
```

  </details>

</details>

### orders

---

### 주문 추가

> ![](https://img.shields.io/static/v1?label=&message=POST&color=brightgreen) <br>
> localhost:19091/**orders**

<details markdown="1">
<summary>detail</summary>

#### Parameters

##### Body

|    name     |     type      | description  |
|:-----------:|:-------------:|:------------:|
|  order_id   |     Long      |    주문 ID     | 
|    name     |    String     |    주문 이름     |
| product_ids | Integer Array | 주문한 상품 ID 목록 |

#### Response

  <summary>200 Ok : 주문 추가 성공</summary>


</details>

### 주문에 상품 추가

> ![](https://img.shields.io/static/v1?label=&message=PUT&color=orange) <br>
> localhost:19091/**orders/{orderId}**

<details markdown="1">
<summary>detail</summary>

#### Parameters

##### Body

|    name    | type | description |
|:----------:|:----:|:-----------:|
| product_id | Long |  추가할 상품 ID  | 

#### Response

  <summary>200 Ok : 수정 성공</summary>



</details>

### 주문 단건 조회

> ![](https://img.shields.io/static/v1?label=&message=GET&color=blue) <br>
> localhost:19091/**orders/{orderId}**

<details markdown="1">
<summary>detail</summary>

#### Response

  <details markdown="1">
  <summary>200 Ok : 조회 성공</summary>

```json
{
  "order_id": 1,
  "product_ids": [
    1,
    2,
    3
  ]
}
```

  </details>

</details>

### auth

---

### 로그인

> ![](https://img.shields.io/static/v1?label=&message=GET&color=blue) <br>
> localhost:19091/**auth/signIn?user_id={string}**

<details markdown="1">
<summary>detail</summary>

#### Response

  <details markdown="1">
  <summary>200 Ok : 로그인 성공</summary>

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyX2lkIn0.scnTzRCronOpUegsbnHucb3hn2loK0gBsA0M7Zhh0ro"
}
```

  </details>

</details>



