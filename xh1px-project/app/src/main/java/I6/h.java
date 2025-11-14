package I6;

import f7.C0725e;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends f implements W6.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f2199b;

    public h(C0725e c0725e, Object[] objArr) {
        super(c0725e);
        this.f2199b = objArr;
    }

    public final ArrayList a() {
        f vVar;
        Object[] objArr = this.f2199b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            o6.j.b(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC0065d.f2192a;
            if (Enum.class.isAssignableFrom(cls)) {
                vVar = new t(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                vVar = new g(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                vVar = new h(null, (Object[]) obj);
            } else if (obj instanceof Class) {
                vVar = new p(null, (Class) obj);
            } else {
                vVar = new v(null, obj);
            }
            arrayList.add(vVar);
        }
        return arrayList;
    }
}
