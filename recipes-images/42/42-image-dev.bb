require 42-image-base.bb

SUMMARY = "42 development image."

IMAGE_INSTALL += "\
    packagegroup-42-network \
    packagegroup-42-dev \
"

IMAGE_FEATURES += "dev-pkgs"