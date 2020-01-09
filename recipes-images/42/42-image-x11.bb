require 42-image.inc

SUMMARY = "42 image with x11 support"

IMAGE_INSTALL += "\
    packagegroup-42-graphic \
"

IMAGE_FEATURES += "\
	package-management \
	x11 \
	wayland \
	x11-base \
"


CORE_IMAGE_EXTRA_INSTALL += " \
	wayland \
	weston \
	xserver-xorg-xwayland \
	weston-xwayland \
	weston-init \
	weston-examples \
"

IMAGE_ROOTFS_EXTRA_SPACE = "5242880"