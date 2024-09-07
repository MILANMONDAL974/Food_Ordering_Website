let navbar = document.querySelector('.header .flex .navbar');

document.querySelector('#menu-btn').onclick = () =>{
   navbar.classList.toggle('active');
}

document.querySelector('#user-btn').onclick = () =>{
   navbar.classList.remove('active');
}

window.onscroll = () =>{
   navbar.classList.remove('active');
}

function loader(){
   document.querySelector('.loader').style.display = 'none';
}

function fadeOut(){
  setTimeout(loader, 2000);
}


window.onload = fadeOut;





   /*
   const rotate = () => {
      const cubes = document.querySelectorAll(".cube");
    
      Array.from(cubes).forEach(
        (cube) => (cube.style.transform = `rotateY(${x}deg)`)
      );
    };
    
    const changePlayPause = () => {
      const i = document.querySelector(".play-pause i");
      const cls = i.classList[1];
      if (cls === "fa-play") {
        i.classList.remove("fa-play");
        i.classList.add("fa-pause");
      } else {
        i.classList.remove("fa-pause");
        i.classList.add("fa-play");
      }
    };
    
    let x = 0;
    let bool = false;
    let interval;
    
    const playPause = () => {
      if (!bool) {
        interval = setInterval(() => {
          x -= 90;
          rotate();
        }, 3000);
        changePlayPause();
        bool = true;
      } else {
        clearInterval(interval);
        changePlayPause();
        bool = false;
      }
    };
    
    document.querySelector(".left-arrow").addEventListener("click", () => {
      x += 90;
      rotate();
      if (bool) {
        playPause();
      }
    });
    
    document.querySelector(".left-arrow").addEventListener("mouseover", () => {
      x += 25;
      rotate();
    });
    
    document.querySelector(".left-arrow").addEventListener("mouseout", () => {
      x -= 25;
      rotate();
    });
    
    document.querySelector(".right-arrow").addEventListener("click", () => {
      x -= 90;
      rotate();
      if (bool) {
        playPause();
      }
    });
    
    document.querySelector(".right-arrow").addEventListener("mouseover", () => {
      x -= 25;
      rotate();
    });
    
    document.querySelector(".right-arrow").addEventListener("mouseout", () => {
      x += 25;
      rotate();
    });
    
    document.querySelector(".play-pause").addEventListener("click", () => {
      playPause();
    });
    */

    
