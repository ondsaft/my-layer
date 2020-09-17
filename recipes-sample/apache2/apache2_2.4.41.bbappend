FILES_${PN} += "/var/volatile/log/apache2"

do_install_append() {
    install -m 0755 -d ${D}/var/volatile/log/apache2
}
