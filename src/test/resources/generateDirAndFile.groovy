def inMainDir = new File("$inDir");
def outMainDir = new File("$outDir");
def file = new File(inMainDir, "$filePattern");

inMainDir.mkdirs();
outMainDir.mkdirs();
file << 'This is a Sample Content';