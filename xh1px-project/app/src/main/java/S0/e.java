package S0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f5198c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f5199a;

    /* renamed from: b, reason: collision with root package name */
    public f f5200b;

    public e(String... strArr) {
        this.f5199a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, int i4) {
        boolean z8;
        boolean z9;
        List list = this.f5199a;
        if (i4 < list.size()) {
            if (i4 == list.size() - 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            String str2 = (String) list.get(i4);
            if (!str2.equals("**")) {
                if (!str2.equals(str) && !str2.equals("*")) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if ((z8 || (i4 == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z9) {
                    return true;
                }
            } else if (!z8 && ((String) list.get(i4 + 1)).equals(str)) {
                if (i4 == list.size() - 2 || (i4 == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                }
            } else {
                if (!z8) {
                    int i8 = i4 + 1;
                    if (i8 >= list.size() - 1) {
                        return ((String) list.get(i8)).equals(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int b(String str, int i4) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f5199a;
        if (!((String) list.get(i4)).equals("**")) {
            return 1;
        }
        if (i4 == list.size() - 1 || !((String) list.get(i4 + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final boolean c(String str, int i4) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5199a;
        if (i4 >= list.size()) {
            return false;
        }
        if (((String) list.get(i4)).equals(str) || ((String) list.get(i4)).equals("**") || ((String) list.get(i4)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(String str, int i4) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5199a;
        if (i4 < list.size() - 1 || ((String) list.get(i4)).equals("**")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f5199a.equals(eVar.f5199a)) {
                return false;
            }
            f fVar = this.f5200b;
            f fVar2 = eVar.f5200b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.f5199a.hashCode() * 31;
        f fVar = this.f5200b;
        if (fVar != null) {
            i4 = fVar.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public final String toString() {
        boolean z8;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f5199a);
        sb.append(",resolved=");
        if (this.f5200b != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        sb.append(z8);
        sb.append('}');
        return sb.toString();
    }

    public e(e eVar) {
        this.f5199a = new ArrayList(eVar.f5199a);
        this.f5200b = eVar.f5200b;
    }
}
