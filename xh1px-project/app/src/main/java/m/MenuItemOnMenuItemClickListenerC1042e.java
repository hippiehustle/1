package m;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1042e implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f12328c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f12329a;

    /* renamed from: b, reason: collision with root package name */
    public Method f12330b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f12329a;
        Method method = this.f12330b;
        try {
            if (method.getReturnType() == Boolean.TYPE) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e9) {
            throw new RuntimeException(e9);
        }
    }
}
