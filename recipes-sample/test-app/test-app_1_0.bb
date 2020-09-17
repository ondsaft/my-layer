DESCRIPTION = "This package contains the simple testApp program."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a194fc8d8fd1af2ed08cf252d9602023" 

SECTION = "custome"

PR = "r1"

SRC_URI = "file://test-app.c \
	   file://LICENSE \
          "

S = "${WORKDIR}"

do_compile() {
  ${CC} ${CFLAGS} ${LDFLAGS} -O0 -gdwarf-4 -o test-app test-app.c
}

do_install() {
  install -d ${D}${bindir}
  install -m 0755 test-app ${D}${bindir}
}
