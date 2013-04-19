DESCRIPTION = "Firmware for Marvel 8686 gspi wifi chipset"
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://Marvell-Licence.txt;md5=4725db20ee6d3466bfc15f27076df560"
SRC_URI = "file://${PV}.tar.gz"

PR="r1"

S = "${WORKDIR}/${PV}/FwImage"

do_install() {

	install -d ${D}${base_libdir}/firmware
	install -m 0644 gspi8686.bin helper_gspi.bin ${D}${base_libdir}/firmware
	ln -s helper_gspi.bin ${D}${base_libdir}/firmware/gspi8686_hlp.bin
}

PACKAGES = "${PN}"
FILES_${PN} += "${base_libdir}/firmware"

PACKAGE_ARCH = "all"
