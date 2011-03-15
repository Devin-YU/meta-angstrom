DESCRIPTION="Format a card for omap3 booting"
LICENSE = "GPLv2"
SRC_URI = "file://omap3-mkcard.sh"

PR = "r1"

do_install() {
	install -d ${D}${bindir}/
	install -m 755 ${WORKDIR}/omap3-mkcard.sh ${D}${bindir}/
}

PACKAGE_ARCH_${PN} = "all"
RDEPENDS_${PN} = "bc dosfstools e2fsprogs-mke2fs util-linux util-linux-sfdisk"

