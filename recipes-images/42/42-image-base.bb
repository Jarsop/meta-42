require 42-image-minimal.bb

SUMMARY = "42 image base."

IMAGE_INSTALL += "\
    packagegroup-42-network \
    packagegroup-42-tool \
"

IMAGE_ROOTFS_EXTRA_SPACE = "5242880"
