const button = document.getElementById("meowButton");
const meowSound = document.getElementById("meowSound");

button.addEventListener("click", function() {
    meowSound.play();
});