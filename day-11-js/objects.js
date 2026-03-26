const users = [
    { "id": 1, "name": "A", "active": true },
    { "id": 2, "name": "B", "active": false },
    { "id": 3, "name": "C", "active": true }
];
// users[2].active=false;
console.log(users[0].name);
users.forEach((user)=>{
    user.active = !user.active
});
console.log(users);

/* function countActive(users) {
    return users.filter((user, index)=>{
        return user.active;
    });
} */
// console.log(countActive(users));
;
const user1 = {
    name: 'john',
    age: 10,
    address: {
        house: 75,
        street: 'kayyar',
        pin: 567878
    }
}//ES5
// console.log(user1.name);
// console.log(user1['name']);
// console.log(user1.address.pin);


/* class User{ //ES6
    name='Pariwesh'
}
const u1 = new User();
console.log(u1.name);

let i = true;
let str = i.toString();

 */