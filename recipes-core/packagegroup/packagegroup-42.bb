inherit packagegroup

PACKAGES = "\
    ${PN}-base \
    ${PN}-boot \
    ${PN}-edit \
    ${PN}-tool \
    ${PN}-network \
    ${PN}-dev \
    ${PN}-graphic \
"

RDEPENDS_${PN}-base = "\
    bash \
    sudo \
    apt \
    ${PN}-boot \
    kernel-modules \
"

RDEPENDS_${PN}-boot = "\
    grub \
"

RDEPENDS_${PN}-network = "\
    packagegroup-core-ssh-openssh \
    connman \
"

RDEPENDS_${PN}-dev = "\
    strace \
"

RDEPENDS_${PN}-edit = "\
    vim \
"

RDEPENDS_${PN}-tool = "\
    libcap \
    libcap-bin \
    usbutils \
"

RDEPENDS_${PN}-graphic = "\
    gnome-desktop3 \
    gnome-menus3 \
    gnome-keyring \
    nautilus \
    metacity \
    zenity \
    gedit \
    liri-world \
    polkit \
"