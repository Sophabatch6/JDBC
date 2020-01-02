package Template_Pattern;

abstract class workerTemplate {
    abstract void work();
    abstract void eat();
    abstract void relax();
    final void DailyRoutine(){
        work();
        eat();
        relax();
    }
}
