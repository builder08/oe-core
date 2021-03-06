DESCRIPTION = "Search the internet bases themoviedb.org/kinopoisk.ru"
HOMEPAGE = "https://github.com/Dima73/enigma2-plugin-extensions-tmbd"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://README;md5=a1f8725511fa113a2b2a282860d4fc19"
SRC_URI = "git://github.com/Dima73/enigma2-plugin-extensions-tmbd.git;protocol=https \
	file://YouTube.key \
"

S = "${WORKDIR}/git"

inherit gitpkgv
PV = "1+git${SRCPV}"
PKGV = "1+git${GITPKGV}"

inherit distutils-openplugins

RDEPENDS_${PN} = " \
	python-twisted-web \
	python-xml \
	python-shell \
	python-misc \
	python-html \
	python-subprocess \
	python-unixadmin \
	python-lxml \
	"

CONFFILES = "${sysconfdir}/enigma2/YouTube.key"

do_install_append() {
	install -d ${D}${sysconfdir}/enigma2
	install -m 0644 ${WORKDIR}/YouTube.key ${D}${sysconfdir}/enigma2/YouTube.key
}
