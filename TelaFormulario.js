function toggleMenu() {
    const menu = document.getElementById("menuLateral");

    if (menu.style.right === "0px") {
        menu.style.right = "-300px";
    } else {
        menu.style.right = "0px";
    }
}