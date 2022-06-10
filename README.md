# My first Spring Boot REST API

This is a project that shows you how to build Spring boot REST API that connects to MySQL databse using Spring JdcbTemplate.<br/>
Database used is called "university" and created by one of my professors. All data in the database is for test purposes only.


## Features

- Create students
- List all students
- Fetch single student by id
- Update student by id
- Delete students by id

  
## API Reference

We will create a Student REST API, following are the rest end points

### Get all employees

```http
  GET .../students
```

#### Sample Response

```json
 [
  { 
    "name":"Zhang",
    "dept_name":"Comp. Sci.",
    "tot_cred":102,
    "id":128
  },
  {
    "name":"Shankar",
    "dept_name":"Comp. Sci.",
    "tot_cred":32,
    "id":12345
   },
   {
    "name":"Brandt",
    "dept_name":"History",
    "tot_cred":80,
    "id":19991
   },
   {
    "name":"Chavez",
    "dept_name":"Finance",
    "tot_cred":110,
    "id":23121
   },
   {
    "name":"Peltier",
    "dept_name":"Physics",
    "tot_cred":56,
    "id":44553
   },
   {
    "name":"Levy",
    "dept_name":"Physics",
    "tot_cred":46,
    "id":45678
   },
   {
    "name":"Williams",
    "dept_name":"Comp. Sci.",
    "tot_cred":54,
    "id":54321
   },
   {
    "name":"Sanchez",
    "dept_name":"Music",
    "tot_cred":38,
    "id":55739
   },
   {
    "name":"Snow",
    "dept_name":"Physics",
    "tot_cred":0,
    "id":70557
   },
   {
    "name":"Brown",
    "dept_name":"Comp. Sci.",
    "tot_cred":58,
    "id":76543
   },
   {
    "name":"Aoi",
    "dept_name":"Elec. Eng.",
    "tot_cred":60,
    "id":76653
   },
   {
    "name":"Bourikas",
    "dept_name":"Elec. Eng.",
    "tot_cred":98,
    "id":98765
   },
   {
    "name":"Tanaka",
    "dept_name":"Biology",
    "tot_cred":120,
    "id":98988
   }
  ]
```

### Get single employee

```http
  GET .../student/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of employee to fetch |

#### Sample Response

```json
{
    "name": "Zhang",
    "dept_name": "Comp. Sci.",
    "tot_cred": "102",
    "id": "128"
}
```

### Save student

```http
  POST .../students
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `student reference`      | `Student` | **Required**. Request body of student |

#### Sample Request

```json
{
    "name": "Kevin",
    "dept_name": "Comp. Sci.",
    "tot_cred": "133",
    "id": "13039"
}
```

### Update student

```http
  PUT .../students/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of student to update |
| `students reference`      | `Student` | **Required**. Request body of student |

#### Sample Request

```json
{
    "name": "Kevin",
    "dept_name": "History",
    "tot_cred": "136",
    "id": "13039"
}
```

### Delete student

```http
  DELETE .../students/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of student to delete |

  
## Authors

- [@kkemmere](https://github.com/kkemmere)

