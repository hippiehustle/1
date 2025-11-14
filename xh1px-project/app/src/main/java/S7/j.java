package S7;

import L7.AbstractC0166y;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f5463f;

    public j(Runnable runnable, long j, boolean z8) {
        super(j, z8);
        this.f5463f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5463f.run();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f5463f;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0166y.l(runnable));
        sb.append(", ");
        sb.append(this.f5461d);
        sb.append(", ");
        if (this.f5462e) {
            str = "Blocking";
        } else {
            str = "Non-blocking";
        }
        return A.j.q(sb, str, ']');
    }
}
