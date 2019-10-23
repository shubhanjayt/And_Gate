package Logicgate;

class LogicG {
    public static void main(String[] args) {
        AND andgate = new AND();
        andgate.printTruthTable();
        OR orgate = new OR();
        orgate.printTruthTable();
        NOT notgate = new NOT();
        notgate.printTruthTable();
        NANDGate nand = new NANDGate();
        nand.printTruthTable();
        NORGate nor = new NORGate();
        nor.printTruthTable();
        XORGate xor = new XORGate();
        xor.printTruthTable();
        XNORGate xnor = new XNORGate();
        xnor.printTruthTable();
    }
}

class AND {
    private int input1;
    private int input2;

    public AND() {

            input1 = 0;
            input2 = 0;
        }

    public AND( int input1, int input2)
        {
            this.input1 = input1;
            this.input2 = input2;
        }

        public void setInput1 ( int input1){
            this.input1 = input1;
        }
        public int getInput1 () {
            return this.input1;
        }

        public void setInput2 ( int input2){
            this.input2 = input2;
        }
        public int getInput2 () {
            return this.input2;
        }

        private int getOutput ( int input1, int input2)
        {
            setInput1(input1);
            setInput2(input2);
            return (this.input1 == 0 || this.input2 == 0) ? 0 : 1;
        }

        private void printOutput () {
            System.out.println(0 + " AND " + 0 + " results " + getOutput(0, 0) + '\n' +
                    0 + " AND " + 1 + " results " + getOutput(0, 1) + '\n' +
                    1 + " AND " + 0 + " results " + getOutput(1, 0) + '\n' +
                    1 + " AND " + 1 + " results " + getOutput(1, 1) + '\n');

        }

        public void printTruthTable () {
            System.out.println("----Truth Table For AND Gate----");
            printOutput();
        }
    }


class OR {
    private int input1;
    private int input2;

    public OR() {
        input1 = 0;
        input2 = 0;
    }

    public OR(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return this.input1;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput2() {
        return this.input2;
    }

    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == 1 || this.input2 == 1) ? 1 : 0;
    }

    private void printOutput() {
        System.out.println(0 + " OR " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " OR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " OR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " OR " + 1 + " results " + getOutput(1, 1) + '\n');

    }

    public void printTruthTable() {
        System.out.println("----Truth Table For OR Gate----");
        printOutput();
    }
}

class NOT {
    private int input1;

    public NOT() {
        input1 = 0;
    }

    public NOT(int input1) {
        this.input1 = input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return this.input1;
    }


    private int getOutput(int input1) {
        setInput1(input1);
        if (input1 == 0)
            return 1;
        else
            return 0;
    }

    private void printOutput() {
        System.out.println(" NOT " + 0 + " results " + getOutput(0) + '\n' +
                " NOT " + 1 + " results " + getOutput(1) + '\n');

    }

    public void printTruthTable() {
        System.out.println("----Truth Table For NOT Gate----");
        printOutput();
    }
}

class NANDGate {
    private int input1;
    private int input2;


    public NANDGate() {
        input1 = 0;
        input2 = 0;
    }


    public NANDGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }


    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return this.input1;
    }


    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput2() {
        return this.input2;
    }


    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == 1 && this.input2 == 1) ? 0 : 1;
    }


    private void printOutput() {
        System.out.println(0 + " NAND " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " NAND " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " NAND " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " NAND " + 1 + " results " + getOutput(1, 1) + '\n');


    }


    public void printTruthTable() {
        System.out.println("----Truth Table For NAND Gate----");
        printOutput();
    }
}


class XNORGate {
    private int input1;
    private int input2;


    public XNORGate() {
        input1 = 0;
        input2 = 0;
    }


    public XNORGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }


    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return this.input1;
    }


    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput2() {
        return this.input2;
    }


    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == this.input2) ? 1 : 0;
    }


    private void printOutput() {
        System.out.println(0 + " XNOR " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " XNOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " XNOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " XNOR " + 1 + " results " + getOutput(1, 1) + '\n');


    }


    public void printTruthTable() {
        System.out.println("----Truth Table For XNOR Gate----");
        printOutput();
    }


    public static void main(String[] args) {
        XNORGate o = new XNORGate();
        o.printTruthTable();
    }
}


class XORGate {
    private int input1;
    private int input2;


    public XORGate() {
        input1 = 0;
        input2 = 0;
    }


    public XORGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }


    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return this.input1;
    }


    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput2() {
        return this.input2;
    }


    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == this.input2) ? 0 : 1;
    }


    private void printOutput() {
        System.out.println(0 + " XOR " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " XOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " XOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " XOR " + 1 + " results " + getOutput(1, 1) + '\n');


    }


    public void printTruthTable() {
        System.out.println("----Truth Table For XOR Gate----");
        printOutput();
    }
}


class NORGate {
    private int input1;
    private int input2;


    public NORGate() {
        input1 = 0;
        input2 = 0;
    }


    public NORGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }


    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return this.input1;
    }


    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public int getInput2() {
        return this.input2;
    }


    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == 0 && this.input2 == 0) ? 1 : 0;
    }


    private void printOutput() {
        System.out.println(0 + " NOR " + 0 + " results " + getOutput(0, 0) + '\n' +
                0 + " NOR " + 1 + " results " + getOutput(0, 1) + '\n' +
                1 + " NOR " + 0 + " results " + getOutput(1, 0) + '\n' +
                1 + " NOR " + 1 + " results " + getOutput(1, 1) + '\n');


    }


    public void printTruthTable() {
        System.out.println("----Truth Table For NOR Gate----");
        printOutput();
    }
}




