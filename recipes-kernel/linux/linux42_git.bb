# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

require recipes-kernel/linux/linux-yocto.inc

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   Documentation/COPYING-logo
#   Documentation/process/license-rules.rst
#   Documentation/translations/it_IT/process/license-rules.rst
#   Documentation/translations/zh_CN/process/license-rules.rst
#   Documentation/scsi/LICENSE.qla4xxx
#   Documentation/scsi/LICENSE.FlashPoint
#   Documentation/scsi/LICENSE.qla2xxx
#   Documentation/networking/device_drivers/qlogic/LICENSE.qla3xxx
#   Documentation/networking/device_drivers/qlogic/LICENSE.qlge
#   Documentation/networking/device_drivers/qlogic/LICENSE.qlcnic
#   LICENSES/preferred/GPL-2.0
#   LICENSES/preferred/LGPL-2.1
#   LICENSES/preferred/LGPL-2.0
#   LICENSES/deprecated/GPL-1.0
#   drivers/net/LICENSE.SRC
#   drivers/net/wireless/marvell/libertas/LICENSE
#   tools/usb/usbip/COPYING
#   include/linux/license.h
#   fs/jffs2/LICENCE
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814 \
                    file://Documentation/COPYING-logo;md5=c12e6a02a126220ed420586143f96d7e \
                    file://Documentation/process/license-rules.rst;md5=ca74e55fc53c93556c55eb4db13190ed \
                    file://Documentation/translations/it_IT/process/license-rules.rst;md5=6df263ada12c886cd576cb0592cd64d5 \
                    file://Documentation/translations/zh_CN/process/license-rules.rst;md5=2692d82e86da49de2f15472365875637 \
                    file://Documentation/scsi/LICENSE.qla4xxx;md5=adc31a736607fafceacc68c6f1b08a0f \
                    file://Documentation/scsi/LICENSE.FlashPoint;md5=ef7704635ba02fb27f5e524565d54c10 \
                    file://Documentation/scsi/LICENSE.qla2xxx;md5=5750f79fa0beb650f04f8035be89bd43 \
                    file://Documentation/networking/device_drivers/qlogic/LICENSE.qla3xxx;md5=ae5c998421760d17dd805a57f798a82b \
                    file://Documentation/networking/device_drivers/qlogic/LICENSE.qlge;md5=6936a28c2f2dd5644139be15f271d7c7 \
                    file://Documentation/networking/device_drivers/qlogic/LICENSE.qlcnic;md5=3252cba622a54474abf62e5eb9af6653 \
                    file://LICENSES/preferred/GPL-2.0;md5=e6a75371ba4d16749254a51215d13f97 \
                    file://LICENSES/preferred/LGPL-2.1;md5=b370887980db5dd40659b50909238dbd \
                    file://LICENSES/preferred/LGPL-2.0;md5=0e1dd121ad1021213d7de823991892f5 \
                    file://LICENSES/deprecated/GPL-1.0;md5=bf22c04ca6f38a97ce863a18d690d0f9 \
                    file://drivers/net/LICENSE.SRC;md5=e5e50f92b87d827b29e6e79e05432963 \
                    file://drivers/net/wireless/marvell/libertas/LICENSE;md5=4ea603c400089f5e404cc5e453d17bc5 \
                    file://tools/usb/usbip/COPYING;md5=1f6f1c0be32491a0c8d2915607a28f36 \
                    file://include/linux/license.h;md5=b87e387897564e2a7745ce95b49147cf \
                    file://fs/jffs2/LICENCE;md5=fcd40f6cb09221b0782c1d09ba266911"

LINUX_GIT ?= "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;name=kernel;protocol=https"
LINUX_BRANCH ?= "branch=master"
LINUX_SRCREV ?= "c60174717544aa8959683d7e19d568309c3a0c65"

SRCREV_kernel = "${LINUX_SRCREV}"
SRC_URI = "${LINUX_GIT};${LINUX_BRANCH}"

KMETA = "kernel-meta"
KCONF_BSP_AUDIT_LEVEL = "2"

SRCREV_meta = "bd84fef3340cadb0e01004f655b2e50a1c07be70"

DEPENDS += "${@bb.utils.contains('ARCH', 'x86', 'elfutils-native', '', d)}"
DEPENDS += "openssl-native util-linux-native"

SRC_URI += " \
	git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=master;destsuffix=${KMETA} \
	file://defconfig \
	file://42-config.cfg \
"

PV = "1.0-mainline+${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

#S = "${WORKDIR}/git"


DESCRIPTION = "Jgeslin 42 Linux kernel"

KCONFIG_MODE = "--alldefconfig"
LINUX_VERSION = "5.5.0-rc2+"
LINUX_VERSION_EXTENSION = "-jgeslin42"
KERNEL_VERSION_SANITY_SKIP="1"