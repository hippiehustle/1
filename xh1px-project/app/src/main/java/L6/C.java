package L6;

/* loaded from: classes.dex */
public abstract class C extends K {
    public abstract Object a();

    public final String toString() {
        String obj;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(');
        if (this instanceof F) {
            obj = "\"" + ((Object) ((F) this).f3052a) + '\"';
        } else {
            obj = a().toString();
        }
        return A.j.q(sb, obj, ')');
    }
}
