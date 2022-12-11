def loadColors(){
    RED="\033[;31m"
    BLUE="\033[;34m"
    CYAN="\033[;36m"
    GREEN="\033[;32m"
    PURPLE="\033[;35m"
    ON_YELLOW="\033[;43m"
    NC="\033[0m"

}

def info(message) {
    loadColors()
    sh """
    set +x; echo -e "${CYAN}[INFO] - $message  ${NC}"
    """
}

def warn(message) {
    loadColors()
    sh """
    set +x; echo -e "${PURPLE}[INFO] - $message  ${NC}"
    """
}

def debug(message) {
    loadColors()
    sh """
    set +x; echo -e "${PURPLE}[INFO] - $message  ${NC}"
    """
}

return this