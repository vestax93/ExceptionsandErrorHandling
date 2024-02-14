package calculator;

public class MemoryRecall implements Operation {
    private MemoryStorage memory;

    public MemoryRecall(MemoryStorage memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(int operand) {

    }

    @Override
    public int getResult() {
        return this.memory.getResult();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
