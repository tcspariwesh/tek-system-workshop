setTimeout(() => {
    console.log("Step 1");

    setTimeout(() => {
        console.log("Step 2");

        setTimeout(() => {
            console.log("Step 3");
        }, 100);

    }, 1000);

}, 1000);



/* const myFun = (message) => {
    console.log(message);
       
}
setTimeout(myFun, 5000);
setTimeout(myFun,15000);
myFun('m1') */