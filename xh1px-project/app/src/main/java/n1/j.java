package n1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12856a;

    public j(k kVar) {
        this.f12856a = kVar;
    }

    public final boolean a(String str) {
        k kVar = this.f12856a;
        Z5.j jVar = (Z5.j) kVar.f12858e.get(str);
        if (jVar != null) {
            if (kVar.f12857d.getInt(((Number) jVar.f7486e).intValue()) != 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException(A.j.p("Can't get Boolean value, column ", str, " doesn't exist"));
    }

    public final int b(String str) {
        k kVar = this.f12856a;
        Z5.j jVar = (Z5.j) kVar.f12858e.get(str);
        if (jVar != null) {
            return kVar.f12857d.getInt(((Number) jVar.f7486e).intValue());
        }
        throw new IllegalArgumentException(A.j.p("Can't get Int value, column ", str, " doesn't exist"));
    }

    public final long c(String str) {
        o6.j.e(str, "columnName");
        k kVar = this.f12856a;
        Z5.j jVar = (Z5.j) kVar.f12858e.get(str);
        if (jVar != null) {
            return kVar.f12857d.getLong(((Number) jVar.f7486e).intValue());
        }
        throw new IllegalArgumentException(A.j.p("Can't get Long value, column ", str, " doesn't exist"));
    }

    public final String d(String str) {
        k kVar = this.f12856a;
        Z5.j jVar = (Z5.j) kVar.f12858e.get(str);
        if (jVar != null) {
            String string = kVar.f12857d.getString(((Number) jVar.f7486e).intValue());
            if (string != null) {
                return string;
            }
        }
        throw new IllegalArgumentException(A.j.p("Can't get String value, column ", str, " doesn't exist"));
    }
}
