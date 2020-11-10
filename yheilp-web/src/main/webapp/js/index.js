function editModeControl() {
    var editModeButton = document.getElementById("editModeButton")
    var deleteButtons = document.getElementsByClassName("editModeOnly");
    var x;
    for (x=0; x<deleteButtons.length; x++) {
        if (deleteButtons[x].style.display === "none") {
            deleteButtons[x].style.display = "block";
            editModeButton.className = "btn-light";
            editModeButton.innerHTML = "On";
        } else {
            deleteButtons[x].style.display = "none";
            editModeButton.className = "btn-outline-secondary";
            editModeButton.innerHTML = "Off";
    }

    }

}