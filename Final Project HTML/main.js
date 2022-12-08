window.addEventListener('load', () => {
    //load video feed

    let upbutton = document.querySelector('#up-button');
    let leftbutton = document.querySelector('#left-button');
    let rightbutton = document.querySelector('#right-button');
    let downbutton = document.querySelector('#down-button');
    let lighton = document.querySelector('#togBtn');
    
    upbutton.addEventListener('click', ()=>{
        alert("Up Pressed");
    })
    leftbutton.addEventListener('click', ()=>{
        alert("Left Pressed");
    })
    rightbutton.addEventListener('click', ()=>{
        alert("Right Pressed");
    })
    downbutton.addEventListener('click', ()=>{
        alert("Down Pressed");
    })
    lighton.addEventListener('on', ()=>{
        alert("Light On");
    })
})