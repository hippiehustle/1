package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: n.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC1100B extends C5.p implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f12557c;

    public MenuC1100B(Context context, m mVar) {
        super(context);
        if (mVar != null) {
            this.f12557c = mVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f12557c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        MenuItem[] menuItemArr3 = menuItemArr2;
        int addIntentOptions = this.f12557c.addIntentOptions(i4, i8, i9, componentName, intentArr, intent, i10, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = g(menuItemArr3[i11]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f12557c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        t.j jVar = (t.j) this.f707b;
        if (jVar != null) {
            jVar.clear();
        }
        this.f12557c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f12557c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return g(this.f12557c.findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return g(this.f12557c.getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f12557c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f12557c.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i8) {
        return this.f12557c.performIdentifierAction(i4, i8);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i8) {
        return this.f12557c.performShortcut(i4, keyEvent, i8);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        if (((t.j) this.f707b) != null) {
            int i8 = 0;
            while (true) {
                t.j jVar = (t.j) this.f707b;
                if (i8 >= jVar.f14670f) {
                    break;
                }
                if (((J.a) jVar.f(i8)).getGroupId() == i4) {
                    ((t.j) this.f707b).g(i8);
                    i8--;
                }
                i8++;
            }
        }
        this.f12557c.removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        if (((t.j) this.f707b) != null) {
            int i8 = 0;
            while (true) {
                t.j jVar = (t.j) this.f707b;
                if (i8 >= jVar.f14670f) {
                    break;
                }
                if (((J.a) jVar.f(i8)).getItemId() == i4) {
                    ((t.j) this.f707b).g(i8);
                    break;
                }
                i8++;
            }
        }
        this.f12557c.removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z8, boolean z9) {
        this.f12557c.setGroupCheckable(i4, z8, z9);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z8) {
        this.f12557c.setGroupEnabled(i4, z8);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z8) {
        this.f12557c.setGroupVisible(i4, z8);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f12557c.setQwertyMode(z8);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f12557c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return this.f12557c.addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return g(this.f12557c.add(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i8, int i9, CharSequence charSequence) {
        return this.f12557c.addSubMenu(i4, i8, i9, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i8, int i9, CharSequence charSequence) {
        return g(this.f12557c.a(i4, i8, i9, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i8, int i9, int i10) {
        return this.f12557c.addSubMenu(i4, i8, i9, i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i8, int i9, int i10) {
        return g(this.f12557c.add(i4, i8, i9, i10));
    }
}
