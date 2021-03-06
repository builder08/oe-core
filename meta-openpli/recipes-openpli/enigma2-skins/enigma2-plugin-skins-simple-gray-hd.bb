DESCRIPTION = "Skin SimpleGrayHD by Taapat"
MAINTAINER = "Taapat"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

inherit gitpkgv allarch

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRC_URI = "git://github.com/Taapat/skin-SimpleGrayHD.git;protocol=https"

FILES_${PN} = "${prefix}/"

S = "${WORKDIR}/git"

require skin-data.inc
require skin-python.inc
