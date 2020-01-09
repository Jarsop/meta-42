require recipes-core/images/core-image-minimal.bb

SUMMARY = "42 image."

IMAGE_INSTALL += "\
    packagegroup-42-base \
    packagegroup-42-edit \
"