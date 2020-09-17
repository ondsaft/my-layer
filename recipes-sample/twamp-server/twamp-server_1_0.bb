DESCRIPTION = "This package contains the simple TWAMP Server program."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a194fc8d8fd1af2ed08cf252d9602023"

SECTION = "custome"

PR = "r1"

SRC_URI = "file://twamp-server.c \
	   file://timestamp.c \
	   file://twamp.h \
	   file://LICENSE \
          "

S = "${WORKDIR}"

do_compile() {
  ${CC} ${CFLAGS} ${LDFLAGS} timestamp.c twamp.h twamp-server.c -o twamp-server
}

do_install() {
  install -d ${D}${bindir}
  install -m 0755 twamp-server ${D}${bindir}
}
