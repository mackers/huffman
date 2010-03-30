class NodeSearch {

static String result;
static boolean found;
static int charAt;

public static void lookFor(Node n,char c) {
result = "";
found = false;
n.lookFor(c);
}

public static void toChar(Node n,String bitString) {
result = "";
found = false;
charAt = 0;
n.toChar(bitString);
}

}
